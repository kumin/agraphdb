package com.agraphdb.core.hbase;

import com.google.common.base.Preconditions;
import com.agraphdb.common.config.Properties;
import com.agraphdb.core.repository.EdgeRepository;
import com.agraphdb.core.repository.RepositoryFactory;
import com.agraphdb.core.repository.VertexRepository;

/**
 * TODO: Class description here.
 *
 * @author <a href="https://github.com/tjeubaoit">tjeubaoit</a>
 */
public class HRepositoryFactory implements RepositoryFactory {

    private Properties props;

    @Override
    public EdgeRepository edgeRepository() {
        Preconditions.checkNotNull(props, "Repository Factory must be configure first");
        return new HEdgeRepository(props);
    }

    @Override
    public VertexRepository vertexRepository() {
        Preconditions.checkNotNull(props, "Repository Factory must be configure first");
        return new HVertexRepository(props);
    }

    @Override
    public void configure(Properties p) {
        this.props = p;
    }
}
